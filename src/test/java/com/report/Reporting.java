
	package com.report;

	import java.io.File;
	import java.io.FileNotFoundException;
	import java.io.IOException;
	import java.util.ArrayList;
	import java.util.List;

	import com.base.BaseClass;

	import net.masterthought.cucumber.Configuration;
	import net.masterthought.cucumber.ReportBuilder;

	public class Reporting extends BaseClass {
		
		public static void generateJvmReport(String jsonFile) throws FileNotFoundException, IOException {

			
			File file = new File(getProjectPath()+getPropertyFileValue("jvmpath"));

			
			Configuration configuration = new Configuration(file, "Adactin Automation");

		
			configuration.addClassifications("Browser", "Chrome");
			configuration.addClassifications("Browser Version", "107.0.5304.107");
			configuration.addClassifications("OS", "Windows 8");
			configuration.addClassifications("Sprint", "1");


			List<String> jsonFiles = new ArrayList<String>();
			jsonFiles.add(jsonFile);
			ReportBuilder builder = new ReportBuilder(jsonFiles, configuration);

			
			builder.generateReports();
		}


	

}
