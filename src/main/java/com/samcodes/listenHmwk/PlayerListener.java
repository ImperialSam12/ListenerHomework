public class PlayerListener implements Listener {
    @EventHandler
    public void onPlayerLogin(AsyncPlayerPreLoginEvent event) {
        event.disallow(Result.KICK_OTHER, "You are not allowed to join the server.");
    }
}