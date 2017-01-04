package com.albion.compareVersions;


public class CompareVersions {
    public int compareVersion(String version1, String version2) {
        String[] v1 = version1.split("\\.");
        String[] v2 = version2.split("\\.");

        int size = Math.min(v1.length, v2.length);
        for (int i = 0; i < size; i++) {
            int l = Integer.parseInt(v1[i]);
            int r = Integer.parseInt(v2[i]);

            if(l > r) {
                //36.1.3, 35.9
                return 1;
            } else if(l == r) {

                if(i + 1 == size) {
                    if(v1.length > v2.length){
                        //1.1, 1
                        return 1;
                    } else if(v1.length == v2.length){
                        //1.1, 1.1
                        return 0;
                    } else {
                        //1, 1.1
                        return -1;
                    }
                } else {
                    //35.1, 35.1
                    continue;
                }
            } else {
                //35.1, 34.9
                return -1;
            }
        }
        return 404; //Doesn't matter.
    }
}
