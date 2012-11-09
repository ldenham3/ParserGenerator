public class ParserDemo{
	public static void main(String[] args){
		//generate a parser
		ParserGenerator gen = new DFAParserGenerator();
		Parser parser = gen.createParser("../input/sample_regex_spec.txt");
		//load input file to parser
		parser.loadFile("../input/sample_parser_input.txt");
		while( parser.hasNext()){
			String token = parser.getNext();
			//possibly a check here to print conditionally on the token type
			System.out.print(token);
		}
	}
}