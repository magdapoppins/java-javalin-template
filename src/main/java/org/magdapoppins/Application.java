package org.magdapoppins;

import io.javalin.Javalin;

import java.util.Map;

public class Application {
    public static void main(String[] args) {
        var app = Javalin.create(javalinConfig -> {
            javalinConfig.routes.get("/status", ctx -> {
                ctx.json(Map.of("status", "ok"));
            });
        }).start(8080);
    }
}
