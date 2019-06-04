package com.vlatkovic.meatking.service;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.google.gson.Gson;
import com.vlatkovic.meatking.jsonobjects.General;

@Service
@Transactional
public class InitDBService {

	@Autowired
	private ItemService itemService;

	@PostConstruct
	public void init() {
//		General general = populateGeneralFromJson();

	}

	private General populateGeneralFromJson() {
		File file = new File(
				"C:\\Users\\Bojan\\eclipse-workspace\\MeatKing\\src\\com\\vlatkovic\\meatking\\jsonobjects\\rest.txt");
		BufferedReader reader = null;
		General general = null;

		try {
			reader = new BufferedReader(new FileReader(file));
			StringBuffer jsonSb = new StringBuffer();
			String line = null;
			while ((line = reader.readLine()) != null) {
				jsonSb.append(line);
			}

			String json = jsonSb.toString();
			Gson gson = new Gson();
			general = gson.fromJson(json, General.class);

		} catch (IOException x) {
			System.out.println(x.getMessage());
		} finally {
			try {
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return general;
	}

}
