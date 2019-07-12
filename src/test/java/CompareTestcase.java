import bean.FileInfo;
import org.testng.Assert;
import org.testng.annotations.Test;
import reader.FileReader;

public class CompareTestcase {

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
}
