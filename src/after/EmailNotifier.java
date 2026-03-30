
public class EmailNotifier implements Notifiable {

  @Override
  public void sendEmailNotification(String email){ 
    System.out.println("Email notification sent to: " + email);
  }
}
