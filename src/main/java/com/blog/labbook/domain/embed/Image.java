package com.blog.labbook.domain.embed;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * @author SiWoo Kim,
 * @version 1.0.0
 * @email sm123tt@gmail.com
 * @github : https://github.com/Siwoo-Kim
 * @since 2018-05-13 오후 1:38
 **/


@Data
@Embeddable
public class Image {

    @Column(name = "image_name")
    private String name;
    @Column(name = "image_path")
    private String path;
    @Column(name = "image_extension")
    private ImageExtension extension;

    protected Image() {
    }

    public Image(String name, String path, String extension) {
        this.name = resolveName(name);
        this.path = resolvePath(path);
        this.extension = ImageExtension.memberOf(extension);
    }

    public Image(String name, String path, ImageExtension extension) {
        this.name = resolveName(name);
        this.path = resolvePath(path);
        this.extension = extension;
    }

    @JsonProperty
    public String getFullPath() {
        return path + name + extension.getExtension();
    }

    String resolveName(String name) {
        return name.startsWith("/") ? name.substring(1, name.length()) : name;
    }

    String resolvePath(String path) {
        return !path.endsWith("/") ? path + "/" : path;
    }

}
