package runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        //plugin rapor için eklenir.plugin eklenice target dosyası altında raporlar oluşur.
        //raporu açmak için target dosyası içindeki dosyaya sağ click OpenIn/Explorer/Chrome seçilerek rapor görüntelinir
        plugin={
                "html:target/html-reports/cucumber.html",
                "json:target/json-reports/cucumber.json",
                "junit:target/xml-reports/cucumber.xml"
        },
        features = "./src/test/resources/features",
        glue = "stepdefinitions",
        tags="@test",
        dryRun=false


)
public class Runner {
}
