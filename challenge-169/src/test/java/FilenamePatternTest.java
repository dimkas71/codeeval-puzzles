import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

@RunWith(Parameterized.class)
public class FilenamePatternTest {

    private final String pattern;
    private final String sentence;
    private final String expected;

    public FilenamePatternTest(String pattern, String sentence, String expected) {
        this.pattern = pattern;
        this.sentence = sentence;
        this.expected = expected;
    }


    @Parameterized.Parameters
    public static Collection<Object[]> dataProvider() {
        return Arrays.asList( new Object[][] {
                //0
                {"*7*", "gen_probe.ko palmtx.h macpath.py tzp dm-dirty-log.h bh1770.h pktloc faillog.8.gz zconf.gperf", "bh1770.h"},
                //1
                {"*[0123456789]*[auoei]*",
                 "IBM1008_420.so zfgrep limits.conf.5.gz tc.h ilogb.3.gz limits.conf CyrAsia-TerminusBold28x14.psf.gz nf_conntrack_sip.ko DistUpgradeViewNonInteractive.pyc NFKDQC",
                 "IBM1008_420.so"},
                //2
                {"*.???",
                 "max_user_watches arptables.h net_namespace Kannada.pl menu_no_no.utf-8.vim shtags.1 unistd_32_ia32.h gettext-tools.mo ntpdate.md5sums linkat.2.gz",
                 "menu_no_no.utf-8.vim"},
                //3
                {"*.pdf", "term.log plymouth-upstart-bridge rand.so libipw.ko jisfreq.pyc impedance-analyzer xmon.h 1.5.0.3.txt bank", "-"},
                //4
                {"g*.*",
                 "56b8a0b6.0 sl.vim digctl.h groff-base.conffiles python-software-properties.md5sums CountryInformation.py use_zero_page session-noninteractive d2i_RSAPublicKey.3ssl.gz container-detect.log.4.gz",
                 "groff-base.conffiles"},
                //5
                {"*[0123456789]*",
                 "keyboard.h machinecheck 46b2fd3b.0 libip6t_frag.so timer_defs.h nano-menu.xpm NI vim-keys.conf setjmp.h memcg",
                 "46b2fd3b.0 libip6t_frag.so"}

            });
    }

    @Test
    public void testMatchAll() {
        String actual = new FilePattern().matchAll(pattern, sentence);
        assertThat(actual, is(equalTo(expected)));

    }

}
