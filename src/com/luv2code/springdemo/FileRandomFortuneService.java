package com.luv2code.springdemo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class FileRandomFortuneService implements FortuneService {

	public FileRandomFortuneService() {
		System.out.println("Constructor : FileRandomFortuneService");
	}

	@Override
	public String getDailyFortune() {
		List<String> fortune = getFileFortune();
		Random r = new Random();
		int index = r.nextInt(fortune.size());
		return fortune.get(index);
	}

	private List<String> getFileFortune() {
		List<String> list = new ArrayList<String>();
		File f = new File("./src/fileFortuneData.txt");
		try (BufferedReader br = new BufferedReader(new FileReader(f))) {
			if (f.exists()) {
				String s;
				while ((s = br.readLine()) != null) {
					list.add(s);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

}
