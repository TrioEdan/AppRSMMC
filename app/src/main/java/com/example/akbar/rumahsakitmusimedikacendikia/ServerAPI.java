package com.example.akbar.rumahsakitmusimedikacendikia;

public class ServerAPI {
    public static final String URL_ROOT = "http://192.168.43.105/crud_project/Api.php?apicall=";

    public static final String URL_CREATE = URL_ROOT + "createdata";
    public static final String URL_READ = URL_ROOT + "getdata";
    public static final String URL_UPDATE = URL_ROOT + "updatedata";
    public static final String URL_DELETE = URL_ROOT + "deletedata&id=";
}
