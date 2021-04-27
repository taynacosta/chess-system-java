package Aplication;

import java.util.InputMismatchException;
import java.util.Scanner;

import chess.ChessExeption;
import chess.ChessMacth;
import chess.ChessPiece;
import chess.ChessPosition;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		ChessMacth chessMacth = new ChessMacth();
		//UI.printBoard(chessMacth.getPieces());
		
		while (true) {
			try {
				UI.clearScreen();
				UI.printBoard(chessMacth.getPieces());
				System.out.println();
				System.out.print("Source: ");
				ChessPosition source = UI.readChessPosition(sc);
				
	
				System.out.println();
				System.out.print("Target: ");
				ChessPosition target = UI.readChessPosition(sc);
	
				ChessPiece capturedPiece = chessMacth.performChessMove(source, target);
			}
				catch(ChessExeption e){
					System.out.println(e.getMessage());
					sc.nextLine();
					
				}
		
			catch(InputMismatchException e){
				System.out.println(e.getMessage());
				sc.nextLine();
			}	
			
		}
		
		
	}

}
