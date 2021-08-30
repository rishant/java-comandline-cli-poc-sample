package comandline.cli.java.poc.sample;

import java.io.PrintWriter;

import org.apache.commons.cli.HelpFormatter;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.Options;

//https://www.tutorialspoint.com/commons_cli/commons_cli_quick_guide.htm
//https://commons.apache.org/proper/commons-cli/usage.html

public class CommandLineCliOptionsExample {

	public static void main(String[] args) {
		Option help = new Option( "help", "print this message" );
		Option projecthelp = new Option( "projecthelp", "print project help information" );
		Option version = new Option( "version", "print the version information and exit" );
		Option quiet = new Option( "quiet", "be extra quiet" );
		Option verbose = new Option( "verbose", "be extra verbose" );
		Option debug = new Option( "debug", "print debugging information" );
		Option emacs = new Option( "emacs",
		                           "produce logging information without adornments" );
		
//		Option logfile   = OptionBuilder.withArgName( "file" )
//                .hasArg()
//                .withDescription(  "use given file for log" )
//                .create( "logfile" );
//
//		Option logger = OptionBuilder.withArgName("classname").hasArg()
//				.withDescription("the class which it to perform " + "logging").create("logger");
//
//		Option listener = OptionBuilder.withArgName("classname").hasArg()
//				.withDescription("add an instance of class as " + "a project listener").create("listener");
//
//		Option buildfile = OptionBuilder.withArgName("file").hasArg().withDescription("use given buildfile")
//				.create("buildfile");
//
//		Option find = OptionBuilder.withArgName("file").hasArg()
//				.withDescription("search for buildfile towards the " + "root of the filesystem and use it")
//				.create("find");
		
//		Option property  = OptionBuilder.withArgName( "property=value" )
//                .hasArgs(2)
//                .withValueSeparator()
//                .withDescription( "use value for given property" )
//                .create( "D" );

		Options options = new Options();

		options.addOption( help );
		options.addOption( projecthelp );
		options.addOption( version );
		options.addOption( quiet );
		options.addOption( verbose );
		options.addOption( debug );
		options.addOption( emacs );
//		options.addOption( logfile );
//		options.addOption( logger );
//		options.addOption( listener );
//		options.addOption( buildfile );
//		options.addOption( find );
//		options.addOption( property );
		
		// create the parser
//	    CommandLineParser parser = new DefaultParser();
//	    try {
//	        // parse the command line arguments
//	        CommandLine line = parser.parse( options, args );
//	    }
//	    catch( ParseException exp ) {
//	        // oops, something went wrong
//	        System.err.println( "Parsing failed.  Reason: " + exp.getMessage() );
//	    }
		
		// has the buildfile argument been passed?
//		if( line.hasOption( "buildfile" ) ) {
//		    // initialise the member variable
//		    this.buildfile = line.getOptionValue( "buildfile" );
//		}
		
		// automatically generate the help statement
		HelpFormatter formatter = new HelpFormatter();
		formatter.printHelp( "ant", options );
		
		System.out.println("\n");
		
		final PrintWriter writer = new PrintWriter(System.out);
		formatter.printUsage(writer, 80, "ant", options);
		writer.flush();
	}
}
