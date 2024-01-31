package frc.robot.utils;

public class SwerveModuleConstants {
    public final int driveMotorID;
    public final int angleMotorID;
    public final int absoluteEncoderID;
    public final double absoluteEncoderOffsetDegrees;

    public SwerveModuleConstants(int driveMotorID, int angleMotorID, int absoluteEncoderID, double absoluteEncoderOffsetDegrees) {
        this.driveMotorID = driveMotorID;
        this.angleMotorID = angleMotorID;
        this.absoluteEncoderID = absoluteEncoderID;
        this.absoluteEncoderOffsetDegrees = absoluteEncoderOffsetDegrees;
    }
}
