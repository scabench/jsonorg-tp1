package scabench;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.assertThrows;

/**
 * Test demonstrating CVE-2022-45688.
 * @author jens dietrich
 */
public class CVE202245688Test {

    @Test
    public void confirmVulnerability () throws Exception {
        String input = CVE202245688Test.class.getResource("/dodgy.xml").getFile();
        assertThrows(
            StackOverflowError.class,
            () -> XML2JSONConverter.main(new String[]{input})
        );
    }
}
