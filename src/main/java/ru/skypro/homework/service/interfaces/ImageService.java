package ru.skypro.homework.service.interfaces;

import org.springframework.stereotype.Service;

@Service
public interface ImageService {
    void changeAvatarPath(int userId, String filePath);
}