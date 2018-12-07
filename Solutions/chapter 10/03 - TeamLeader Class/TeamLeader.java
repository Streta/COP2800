/**
   The TeamLeader class stores data about
   an employee who is a production worker
   team leader for the TeamLeader Class
   programming challenge.
*/

public class TeamLeader extends ProductionWorker
{
   private double monthlyBonus;           // Monthly bonus
   private double requiredTrainingHours;  // Required training hours
   private double trainingHoursAttended;  // Training hours attended

   /**
      This constructor initializes an object with a name,
      employee number, hire date, shift, pay rate, monthly
      bonus, number of required training hours, and number
      of training hours attended.
      @param n The employee's name.
      @param num The employee's number.
      @param date The employee's hire date.
      @param sh The employee's shift.
      @param rate The employee's pay rate.
      @param mb Monthly bonus.
      @param rth Required training hours.
      @param tha Training hours attended.
   */

   public TeamLeader(String n, String num, String date,
                     int sh, double rate, double mb,
                     double rth, double tha)
   {
      super(n, num, date, sh, rate);
      monthlyBonus = mb;
      requiredTrainingHours = rth;
      trainingHoursAttended = tha;
   }

   /**
      The no-arg constructor initializes an object with
      null strings for name, employee number, and hire
      date. The day shift is selected, and the pay rate
      is set to 0.0. The monthly bonus, required training
      hours, and training hours attended are also set
      to 0.0.
   */

   public TeamLeader()
   {
      super();
      monthlyBonus = 0.0;
      requiredTrainingHours = 0.0;
      trainingHoursAttended = 0.0;
   }

   /**
      The setMonthlyBonus method sets the employee's
      monthly bonus.
      @param m The employee's monthly bonus.
   */

   public void setMonthlyBonus(double m)
   {
      monthlyBonus = m;
   }

   /**
      The setRequiredTrainingHours method sets the
      employee's required training hours.
      @param r The employee's required training hours.
   */

   public void setRequiredTrainingHours(double r)
   {
      requiredTrainingHours = r;
   }

   /**
      The setTrainingHoursAttended method sets the
      employee's training hours attended.
      @param r The employee's training hours attended.
   */

   public void setTrainingHoursAttended(double t)
   {
      trainingHoursAttended = t;
   }

   /**
      The getMonthlyBonus method returns the employee's
      monthly bonus.
      @return The employee's monthly bonus.
   */

   public double getMonthlyBonus()
   {
      return monthlyBonus;
   }

   /**
      The getRequiredTrainingHours method returns the
      employee's required training hours.
      @return The employee's required training hours.
   */

   public double getRequiredTrainingHours()
   {
      return requiredTrainingHours;
   }

   /**
      The getTrainingHoursAttended method returns the
      employee's training hours attended.
      @return The employee's training hours attended.
   */

   public double getTrainingHoursAttended()
   {
      return trainingHoursAttended;
   }

   /**
      toString method
      @return A reference to a String representation of
              the object.
   */

   @Override
   public String toString()
   {
      String str = super.toString();

      str += String.format("\nMonthly Bonus: $%,.2f",
                           monthlyBonus);

      str += ("\nRequired Training Hours: " +
              requiredTrainingHours);

      str += ("\nTraining Hours Attended: " +
              trainingHoursAttended);

      return str;
   }
}
