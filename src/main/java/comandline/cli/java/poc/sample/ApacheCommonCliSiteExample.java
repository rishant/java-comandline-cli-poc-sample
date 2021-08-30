package comandline.cli.java.poc.sample;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.CommandLineParser;
import org.apache.commons.cli.DefaultParser;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.ParseException;
//https://www.tutorialspoint.com/commons_cli/commons_cli_quick_guide.htm
//https://commons.apache.org/proper/commons-cli/usage.html

//Usage: ls [OPTION]... [FILE]...
//List information about the FILEs (the current directory by default).
//Sort entries alphabetically if none of -cftuSUX nor --sort.
//
//-a, --all                  do not hide entries starting with .
//-A, --almost-all           do not list implied . and ..
//-b, --escape               print octal escapes for nongraphic characters
//    --block-size=SIZE      use SIZE-byte blocks
//-B, --ignore-backups       do not list implied entries ending with ~
//-c                         with -lt: sort by, and show, ctime (time of last
//                           modification of file status information)
//                           with -l: show ctime and sort by name
//                           otherwise: sort by ctime
//-C                         list entries by columns
public class ApacheCommonCliSiteExample {

	public static void main(String[] args) {
		// create the command line parser
		CommandLineParser parser = new DefaultParser();

		// create the Options
		Options options = new Options();
		options.addOption( "a", "all", false, "do not hide entries starting with ." );
		options.addOption( "A", "almost-all", false, "do not list implied . and .." );
		options.addOption( "b", "escape", false, "print octal escapes for nongraphic "
		                                         + "characters" );
		options.addOption(  "SIZE", "block-size", true, "use SIZE-byte blocks");
		options.addOption( "B", "ignore-backups", false, "do not list implied entried "
		                                                 + "ending with ~");
		options.addOption( "c", false, "with -lt: sort by, and show, ctime (time of last " 
		                               + "modification of file status information) with "
		                               + "-l:show ctime and sort by name otherwise: sort "
		                               + "by ctime" );
		options.addOption( "C", false, "list entries by columns" );

		String[] args1 = new String[]{ "--block-size=10" };

		try {
		    // parse the command line arguments
		    CommandLine line = parser.parse( options, args1 );

		    // validate that block-size has been set
		    if( line.hasOption( "block-size" ) ) {
		        // print the value of block-size
		        System.out.println( line.getOptionValue( "block-size" ) );
		    }
		}
		catch( ParseException exp ) {
		    System.out.println( "Unexpected exception:" + exp.getMessage() );
		}
	}
}
