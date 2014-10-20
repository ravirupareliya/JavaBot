// CLASS CREATED 2014/10/19 AT 4:41:58 P.M.
// JavaBot.java by Unihedron
package com.gmail.inverseconduit;

/**
 * Procrastination: I'll fix this javadoc comment later.<br>
 * JavaBot @ com.gmail.inverseconduit
 * 
 * @author Unihedron<<a href="mailto:vincentyification@gmail.com"
 *         >vincentyification@gmail.com</a>>
 */
public class JavaBot {

    /**
     * @param args
     */
    public static void main(String[] args) {
        try {
            JavaBot javaBot = new JavaBot();
            javaBot.login(SESite.STACK_OVERFLOW, BotConfig.LOGIN_EMAIL, BotConfig.PASSWORD);
            javaBot.joinChat(SESite.STACK_OVERFLOW, 139);
        } catch(IllegalStateException ex) {
            ex.printStackTrace();
        }
    }

    public StackExchangeBrowser seBrowser;
    public JavaBot() {
        seBrowser = new StackExchangeBrowser();
    }

    // Wrap StackExchangeBrowser methods for easier API access

    public boolean login(SESite site, String username, String password) {
        return seBrowser.login(site, username, password);
    }
    public boolean joinChat(SESite site, int chatId) {
        return seBrowser.joinChat(site, chatId);
    }

}