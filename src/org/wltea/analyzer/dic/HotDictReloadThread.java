package org.wltea.analyzer.dic;

import org.wltea.analyzer.cfg.PropertiesMethodUtil;

public class HotDictReloadThread implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true) {
			String jdbc_isrun=PropertiesMethodUtil.getProperties("jdbc-reload.properties").getProperty("jdbc.isrun");
			if(jdbc_isrun==null ||jdbc_isrun.equals("0")) 
			{
				return;//此处判断是否启用mysql分词
			}
			try {//先休眠 
				Thread.sleep(Integer.valueOf(String.valueOf(PropertiesMethodUtil.getProperties("jdbc-reload.properties").get("jdbc.reload.interval"))));
			} catch (NumberFormatException e1) { 
				e1.printStackTrace();
			} catch (InterruptedException e1) { 
				e1.printStackTrace();
			} 
			System.out.println("[==========]reload hot dict from mysql......");   
			Dictionary.getSingleton().reLoadMainDict();
		}

	}

}
