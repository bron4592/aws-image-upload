package com.bron4592.awsimageunload.bucket;

public enum BucketName {

    PROFILE_IMAGE("bron4592-image-upload-123");

    private final String bucketName;
    BucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    public String getBucketName(){
        return bucketName;
    }
}
