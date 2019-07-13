import bean.FileInfo;
import constant.Constants;
import executor.ComparatorTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import reader.FileReader;
import reader.PropertyReader;

public class TestCompareTest {

    @Test
    public void test_is_file_url_count_equal_and_match_with_avaliable_data() throws Exception{
        FileReader.start();
        int countUrlForFile1 = FileInfo.getSingleton().getLineCount1();
        int countUrlForFile2 = FileInfo.getSingleton().getLineCount2();
        System.out.println("Counts are:: " + countUrlForFile1 + "Another file count::" + countUrlForFile2);
        if (countUrlForFile1 != countUrlForFile2) {
            Assert.fail("Any of the file has less numbers of url so only given url will be matched.");
        } else {
            Assert.assertEquals(countUrlForFile1,countUrlForFile2);
        }
    }

    @Test
    public void test_comparator(){
        PropertyReader propertyReader = new PropertyReader();
        propertyReader.setProperty(Constants.FILE_NAME1, "src/main/resources/dataset3/file1.txt");
        propertyReader.setProperty(Constants.FILE_NAME2, "src/main/resources/dataset3/file2.txt");
        ComparatorTest.startComparatorProcess();

    }

}
