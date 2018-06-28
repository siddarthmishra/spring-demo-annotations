package com.luv2code.springdemo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.annotation.PostConstruct;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class FileRandomFortuneService implements FortuneService {

	public List<String> list1 = new ArrayList<String>();
	Random r = new Random();

	public FileRandomFortuneService() {
		System.out.println("No-Arg Constructor : FileRandomFortuneService");
	}

	@Override
	public String getDailyFortune() {
		int index = r.nextInt(list1.size());
		return list1.get(index);
	}

	/*private List<String> getFileFortune() {
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
	}*/

	@PostConstruct
	private void getFileFortune() {
		System.out.println("FileRandomFortuneService : @PostConstruct - Inside getFileFortune()");
		File f = new File("./src/fileFortuneData.txt");
		try (BufferedReader br = new BufferedReader(new FileReader(f))) {
			if (f.exists()) {
				String s;
				while ((s = br.readLine()) != null) {
					list1.add(s);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
