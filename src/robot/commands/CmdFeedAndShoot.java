package robot.commands;

import edu.wpi.first.wpilibj2.command.InstantCommand;
//import feeder and shooter subsystems!
import robot.subsystems.FeederSubsystem;
import robot.subsystems.ShooterSubsystem;
//you also need to import something extra since it's a parallel command group
import edu.wpi.first.wpilibj2.command.ParallelCommandGroup;
public class CmdFeedAndShoot extends ParallelCommandGroup{
    double feeder_power;
    double shooter_power;

    public CmdFeedAndShoot(FeederSubsystem m_feeder, ShooterSubsystem m_shooter, double feederPower, double shooterPower) {
        this.feeder_power = feederPower;
        this.shooter_power = shooterPower;
        addCommands(
            new CmdFeeder(m_feeder, feeder_power), //the feeder_power value here would correspond to feederPower from the constructor
            new CmdShooter(m_shooter, shooter_power)
        );
    }
}

//no need for end because it contains commands which has end
  

    



