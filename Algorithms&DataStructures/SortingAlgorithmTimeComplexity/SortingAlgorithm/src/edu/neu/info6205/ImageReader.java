package edu.neu.info6205;

/*
 * Author - Vipul Krishna
 */

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferByte;
import java.io.IOException;
import java.util.Arrays;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class ImageReader extends JPanel{
	
	BufferedImage img;
	double[] bArr;
	public ImageReader() {
//		setSize(1200, 800);
//		setVisible(true);
			
	}
	
	private void loadImage(String path) {
		try {
			img = ImageIO.read(ImageReader.class.getResource(path));
			//final byte[] pixels = ((DataBufferByte) img.getRaster().getDataBuffer()).getData();
			
			int w = img.getWidth();
			int h = img.getHeight();
			
			bArr = new double[w*h];
			int index = 0;
			for (int i=0; i<h; i++) {
				for(int j=0; j<w; j++) {
					
					Color c = new Color(img.getRGB(j, i));
					int alpha = c.getAlpha();
					int red = c.getRed();
					int green  = c.getGreen();
					int blue = c.getBlue();
					
//					int pixel = img.getRGB(j, i);
//					int alpha2 = (pixel >> 24) & 0xff;
//				    int red2 = (pixel >> 16) & 0xff;
//				    int green2 = (pixel >> 8) & 0xff;
//				    int blue2 = (pixel) & 0xff;
				    
				    double intensity = (0.2989*red) + (0.5870*green) + (0.1140*blue);
				    bArr[index] = intensity;
				    index = index + 1;
				   }
			}	
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void getMergSortedArray() {
		loadImage("Boston.jpeg");
		MergeSort mSort = new MergeSort();
		long startTime = System.nanoTime();
		mSort.implementMergeSort(bArr, 0, bArr.length-1);
		long endTime = System.nanoTime();
		long duration = endTime-startTime;
		System.out.println("The time complexity of Merge Sort Algorithm is O(NLogN)");
		System.out.println("MERGE SORT Execution Time in MilliSeconds = "+duration/1000000+" which is proportional to O(NLogN)");
		System.out.println("********************************************************************************************");
	}
	public void getInsertionSortedArray() {
		loadImage("Boston.jpeg");
		InsertionSort iSort = new InsertionSort();
		long startTime = System.nanoTime();
		iSort.implementInsertionSort(bArr);
		long endTime = System.nanoTime();
		long duration = endTime-startTime;
		System.out.println("The time complexity of Insertion Sort Algorithm is O(N^2)");
		System.out.println("INSERTION SORT Execution Time in MilliSeconds = "+duration/1000000+" which is proportional to O(N^2)");
		System.out.println("********************************************************************************************");
	}
	
	public void getHeapSortedArray(){
		loadImage("Boston.jpeg");
		HeapSort hSort = new HeapSort();
		long startTime = System.nanoTime();
		hSort.implementHeapSort(bArr);
		long endTime = System.nanoTime();
		long duration = endTime-startTime;
		System.out.println("The time complexity of Heap Sort Algorithm is O(NLogN)");
		System.out.println("HEAP SORT Execution Time in MilliSeconds = "+duration/1000000+" which is proportional to O(NLogN)");
		System.out.println("Based on the time complexity values, HEAP SORT is the FASTEST Algorithm amongst these 4");
		System.out.println("********************************************************************************************");
	}
	public void getSelectionSortedArray(){
		loadImage("Boston.jpeg");
		SelectionSort sSort = new SelectionSort();
		long startTime = System.nanoTime();
		sSort.implementSelectionSort(bArr);
		long endTime = System.nanoTime();
		long duration = endTime-startTime;
		System.out.println("The time complexity of Selection Sort Algorithm is O(N^2)");
		System.out.println("SELECTION SORT Execution Time in MilliSeconds = "+duration/1000000+" which is proportional to O(N^2)");
		System.out.println("********************************************************************************************");
	}
//	protected void paintComponent(Graphics g) {
//		super.paintComponent(g);
//		g.drawImage(img, 0, 0, 1200, 800, this);
//	}
	
}
