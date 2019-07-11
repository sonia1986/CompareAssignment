import bean.FileInfo;
import org.testng.Assert;
import org.testng.annotations.Test;
import reader.FileReader;

public class CompareTestcase {

    @Test
    public void test_is_file_url_count_equal_and_match_with_avaliable_data(){
        FileReader.start();
        int countUrlFromFile1 = FileInfo.getSingleton().getLineCount1();
        int countUrlFromFile2 = FileInfo.getSingleton().getLineCount2();
        Assert.assertEquals(countUrlFromFile1,countUrlFromFile2, "Url count is matched.");
    }
}
