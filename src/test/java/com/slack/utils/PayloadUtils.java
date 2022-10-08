package com.slack.utils;

public class PayloadUtils {

        public static String getSlackMessagePayLoad(String message ,String channel){
            return "{\n" +
                    "    \"channel\": \""+channel+"\",\n" +
                    "    \"text\": \""+message+"\"\n" +
                    "}";
        }

    }

