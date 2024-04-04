package contactsTests;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.Test;

import genericUtilities.BaseClass;
import objectRepository.ContactInfoPage;
import objectRepository.ContactsPage;
import objectRepository.CreateNewContactPage;
import objectRepository.HomePage;

public class CreateContactWithLeadSourceTest extends BaseClass{

	@Test(groups = "RegressionSuite")
	public void createContactWithLead() throws EncryptedDocumentException, IOException
	{
		/* Read Data from Excel File */
		String LASTNAME = eUtil.readDataFromExcelFile("Contacts", 4, 2);
		String LEADSOURCE = eUtil.readDataFromExcelFile("Contacts", 4, 3);

		// Step 3: Navigate to Contacts Link
		HomePage hp = new HomePage(driver);
		hp.clickOnContactsLnk();

		// Step 4: Click on Create Contact lookUp Image
		ContactsPage cp = new ContactsPage(driver);
		cp.clickOnCreateContactLookUpImg();

		// Step 5: Create contact with mandatory fields and Save
		CreateNewContactPage cncp = new CreateNewContactPage(driver);
		cncp.createNewContact(LASTNAME, LEADSOURCE);;

		// Step 6: Validate for contact
		ContactInfoPage cip = new ContactInfoPage(driver);
		String contactHeader = cip.captureHeaderText();
		
		Assert.assertTrue(contactHeader.contains(LASTNAME));
		
		System.out.println(contactHeader);
	}
}
