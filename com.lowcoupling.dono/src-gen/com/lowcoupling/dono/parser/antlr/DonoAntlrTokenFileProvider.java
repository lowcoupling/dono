/*
* generated by Xtext
*/
package com.lowcoupling.dono.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class DonoAntlrTokenFileProvider implements IAntlrTokenFileProvider {
	
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
    	return classLoader.getResourceAsStream("com/lowcoupling/dono/parser/antlr/internal/InternalDono.tokens");
	}
}
