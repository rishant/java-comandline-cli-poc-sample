package comandline.cli.java.poc.sample;
import java.io.PrintWriter;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.CommandLineParser;
import org.apache.commons.cli.DefaultParser;
import org.apache.commons.cli.HelpFormatter;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.ParseException;

//https://www.tutorialspoint.com/commons_cli/commons_cli_quick_guide.htm
//https://commons.apache.org/proper/commons-cli/usage.html

public class CommandLineCliExample {

    //https://www.tutorialspoint.com/commons_cli/commons_cli_help_example.htm
    public static void main(String[] args) throws ParseException {
	
	      Options options = new Options();
	      options.addOption("p", "print", false, "Send print request to printer.")
	         .addOption("g", "gui", false, "Show GUI Application")
	         .addOption("n", true, "No. of copies to print");
				
	      //////////////////////
	      HelpFormatter formatter = new HelpFormatter();
	      formatter.printHelp("CLITester", options);
	      	      
	      //////////////////////////////////
	      final PrintWriter writer = new PrintWriter(System.out);
	      formatter.printUsage(writer,80,"CLITester", options);
	      writer.flush();
    }
}
