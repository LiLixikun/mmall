package com.mmall.service;

import com.mmall.common.ServerResponse;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

public interface UploadService {

    /**
     * 上传文件
     *
     * @param multipartFile
     * @return
     */
    ServerResponse<String> upload(MultipartFile multipartFile);

    /**
     * 删除文件
     *
     * @param fileName
     * @return
     */
    ServerResponse deletePic(String fileName);

    /**
     * 下载文件
     *
     * @param fileNmae
     * @return
     */
    ServerResponse download(String fileNmae);
}
