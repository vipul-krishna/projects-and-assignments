package edu.neu.info6205;


/*
 * Author - Vipul Krishna
 */

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class ImageSortDriver {

	public static void main(String[] args) {
		
		ImageReader reader = new ImageReader();
		reader.getMergSortedArray();
		reader.getInsertionSortedArray();
		reader.getHeapSortedArray();
		reader.getSelectionSortedArray();
		
		
		
//			SwingUtilities.invokeLater(new Runnable() {
//			
//			@Override
//			public void run() {
//				JFrame frm = new JFrame();
//				frm.setSize(1200, 800);
//				frm.setVisible(true);
//				frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//				frm.add(new MyPanel());
//				
//			}
//		});
		

	}

}
