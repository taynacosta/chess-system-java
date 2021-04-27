package Aplication;

import java.util.Scanner;

import chess.ChessMacth;
import chess.ChessPiece;
import chess.ChessPosition;


public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		ChessMacth chessMacth = new ChessMacth();
		//UI.printBoard(chessMacth.getPieces());
		
		while (true) {
			UI.printBoard(chessMacth.getPieces());
			System.out.println();
			System.out.print("Source: ");
			ChessPosition source = UI.readChessPosition(sc);
			

			System.out.println();
			System.out.print("Target: ");
			ChessPosition target = UI.readChessPosition(sc);

			ChessPiece capturedPiece = chessMacth.performChessMove(source, target);
		}
		
		
	}

}
