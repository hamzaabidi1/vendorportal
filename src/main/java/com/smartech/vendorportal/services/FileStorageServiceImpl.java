package com.smartech.vendorportal.services;

import java.io.IOException;
import java.util.List;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import com.smartech.vendorportal.entities.FileDB;
import com.smartech.vendorportal.repositories.FileDBRepository;

@Service
public class FileStorageServiceImpl implements FileStorageService {

	@Autowired
	private FileDBRepository fileDBRepository;

	public FileDB store(MultipartFile file) throws IOException {
		String fileName = StringUtils.cleanPath(file.getOriginalFilename());
		FileDB FileDB = new FileDB(fileName, file.getContentType(), file.getBytes());

		return fileDBRepository.save(FileDB);
	}

	public FileDB getFile(String id) {
		return fileDBRepository.findById(id).get();
	}

	public Stream<FileDB> getAllFiles() {
		return fileDBRepository.findAll().stream();
	}
	
	public Stream<FileDB> getAllFilesPerRfq(Long id) {
		return fileDBRepository.getAllFilePerRfq(id).stream();
	}

	public List<FileDB> getAllFilesRfq(Long id) {
		return fileDBRepository.getAllFilePerRfq(id);
	}

	public void deleteFile(String id) {	
		fileDBRepository.deleteById(id);
	}
}
