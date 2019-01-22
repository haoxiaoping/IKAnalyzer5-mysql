package org.wltea.analyzer.dic;

public class HotDictReloadThread implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true) {
			try {
				Thread.sleep(180000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("[==========]reload hot dict from mysql......");   
			Dictionary.getSingleton().reLoadMainDict();
		}

	}

}
