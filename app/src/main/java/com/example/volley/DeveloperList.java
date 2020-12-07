package com.example.volley;

public class DeveloperList {

    public String login;
    public String avatar_url;
    public String html_url;

    public DeveloperList(String login, String git_url, String avatar_url) {
        this.login = login;
        this.avatar_url = avatar_url;
        this.html_url = git_url;
    }

    public String getLogin() {
        return login;
    }

    public String getAvatar_url() {
        return avatar_url;
    }

    public String getHtml_url() {
        return html_url;
    }

}
