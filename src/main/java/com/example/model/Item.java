package com.example.model;

import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;
import java.io.File;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by levont on 12/09/2016.
 */
@Entity(name = "item")
public class Item implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    @NotEmpty
    private String name;

    @Column(name = "pitch")
    private String pitch;

    @Column(name = "rate")
    private Integer rate;

    @Column(name = "mix_voice")
    private File mixVoice;

    @Column(name = "mix_voice_modified_date")
    private Date mixVoiceModifiedDate;

    @Column(name = "video")
    private File video;

    @Column(name = "video_modified_date")
    private Date videoUrlModifiedDate;

    @Column(name = "image")
    private File image;

    @Column(name = "image_modified_date")
    private Date imageModifiedDate;

    @Column(name = "thumb")
    private File thumb;

    @Column(name = "thumb_modified_date")
    private Date thumbModifiedDate;

    @Column(name="created_date")
    private Date createdDate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPitch() {
        return pitch;
    }

    public void setPitch(String pitch) {
        this.pitch = pitch;
    }

    public Integer getRate() {
        return rate;
    }

    public void setRate(Integer rate) {
        this.rate = rate;
    }

    public File getMixVoice() {
        return mixVoice;
    }

    public void setMixVoice(File mixVoice) {
        this.mixVoice = mixVoice;
    }

    public Date getMixVoiceModifiedDate() {
        return mixVoiceModifiedDate;
    }

    public void setMixVoiceModifiedDate(Date mixVoiceModifiedDate) {
        this.mixVoiceModifiedDate = mixVoiceModifiedDate;
    }

    public File getVideo() {
        return video;
    }

    public void setVideo(File video) {
        this.video = video;
    }

    public Date getVideoUrlModifiedDate() {
        return videoUrlModifiedDate;
    }

    public void setVideoUrlModifiedDate(Date videoUrlModifiedDate) {
        this.videoUrlModifiedDate = videoUrlModifiedDate;
    }

    public File getImage() {
        return image;
    }

    public void setImage(File image) {
        this.image = image;
    }

    public Date getImageModifiedDate() {
        return imageModifiedDate;
    }

    public void setImageModifiedDate(Date imageModifiedDate) {
        this.imageModifiedDate = imageModifiedDate;
    }

    public File getThumb() {
        return thumb;
    }

    public void setThumb(File thumb) {
        this.thumb = thumb;
    }

    public Date getThumbModifiedDate() {
        return thumbModifiedDate;
    }

    public void setThumbModifiedDate(Date thumbModifiedDate) {
        this.thumbModifiedDate = thumbModifiedDate;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }
}
