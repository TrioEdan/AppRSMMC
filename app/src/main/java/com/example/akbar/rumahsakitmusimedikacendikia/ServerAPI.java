package com.example.akbar.rumahsakitmusimedikacendikia;

public class ServerAPI {
    //ip address diganti dengan ip address komputer yg terhubung ke jaringan
    public static final String URL_ROOT = "http://192.168.100.58/rumahsakit/Api.php?apicall=";

    public static final String URL_CREATE = URL_ROOT + "createdata";
    public static final String URL_READ = "http://192.168.100.58/rumahsakit/get_detail.php?no_medrec=";

}
