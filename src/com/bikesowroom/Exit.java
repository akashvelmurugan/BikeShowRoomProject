package com.bikesowroom;

public class Exit {
	public static void exit() throws InterruptedException {
		String a="ThAnK YoU FoR YoUr ViSiT";
		for (int i = 0; i < a.length(); i++) {
		System.out.print(a.charAt(i));
		Thread.sleep(200);
		}
	}
}
