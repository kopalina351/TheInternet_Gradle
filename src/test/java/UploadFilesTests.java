import PagesSteps.UploadFilesSteps;
import com.codeborne.selenide.Selenide;
import com.tngtech.java.junit.dataprovider.DataProvider;
import com.tngtech.java.junit.dataprovider.DataProviderRunner;
import com.tngtech.java.junit.dataprovider.UseDataProvider;
import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(DataProviderRunner.class)
public class UploadFilesTests {

    UploadFilesSteps uploadFilesSteps = new UploadFilesSteps();

    @DataProvider
    public static Object[] dataProvider() {
        return new Object[][] {
                {"D:\\Automation\\TheInternetProject\\src\\main\\resources\\","Test1.txt"},
                {"D:\\Automation\\TheInternetProject\\src\\main\\resources\\","Test2.txt"},
                {"D:\\Automation\\TheInternetProject\\src\\main\\resources\\","Test3.txt"},
                {"D:\\Automation\\TheInternetProject\\src\\main\\resources\\","Test4.txt"}
        };
    }

    @Test
    @UseDataProvider("dataProvider")
    public void fileUpload(String path, String fileName) {
        uploadFilesSteps.openUploadFilesPage();
        uploadFilesSteps.checkUploadFilesPageIsOpen();
        uploadFilesSteps.uploadFileFromPath(path, fileName);
        uploadFilesSteps.checkThatFileIsUploaded(fileName);
    }
    @After
    public void afterTest() {
        Selenide.closeWebDriver();
    }
}
