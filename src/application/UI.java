package application;

import chess.ChessPiece;

public class UI {//A classe UI significa User Interface
	
	public static void printBoard( ChessPiece[][] pieces ) {
		
		// esse método recebe a matriz de peças da partida 
		
		for ( int i = 0; i < pieces.length; i++ ) {
			System.out.print( ( 8 - i ) + " " );
			for (int j = 0; j < pieces.length; j++) {// consideramos a matriz quadrada por isso pieces.length
				printPiece(pieces[i][j]);
			}
			System.out.println();// quebra a linha
		}
		
		System.out.println("  a b c d e f g h");// imprime a linha de referência 
	}
	
	private static void printPiece( ChessPiece piece ){
		
		if( piece == null ) {
			System.out.print("-");
		}
		else {
			System.out.print(piece);
		}
		
		System.out.print(" ");
		
		// método auxiliar q imprime apenas uma peça
	}
}
