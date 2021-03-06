package it.flaviodepedis.myreportcard;

/**
 * Created by flavio.depedis on 15/08/2017.
 */

/**
 * {@link ReportCard} represents a class to define a grade for each instance of
 * this class associated for example a students
 */
public class ReportCard {

    /** Constant variable to validate grade variable if are negative number before to assign */
    private static final int VERIFY_NEGATIVE = 0;

    /** Variable to define Robotic grade for the report */
    private int mRoboticGrade;

    /** Variable to define Android grade for the report */
    private int mAndroidGrade;

    /** Variable to define Artificial Intelligence grade for the report */
    private int mArtificialIntelligenceGrade;

    /** Variable to define Digital Marketing grade for the report */
    private int mDigitalMarketingGrade;

    /** Variable to define Machine Learning grade for the report */
    private int mMachineLearningGrade;

    /** Variable to define Data Analyst grade for the report */
    private int mDataAnalystGrade;


    /**
     * Create a new ReportCard object.
     *
     * @param mRoboticGrade is the variable that take track grade in matter of Robotic
     * @param mAndroidGrade is the variable that take track grade in matter of Android
     * @param mArtificialIntelligenceGrade is the variable that take track grade in matter of
     *                                     Artificial Intelligence
     * @param mDigitalMarketingGrade is the variable that take track grade in matter of Digital
     *                               Marketing
     * @param mMachineLearningGrade is the variable that take track grade in matter of Machine
     *                              Learning
     * @param mDataAnalystGrade is the variable that take track grade in matter of Data Analyst
     */

    /**  Constructor */
    public ReportCard(int roboticGrade, int androidGrade, int artificialIntelligenceGrade,
                      int digitalMarketingGrade, int machineLearningGrade, int dataAnalystGrade){

        mRoboticGrade = roboticGrade;
        mAndroidGrade = androidGrade;
        mArtificialIntelligenceGrade = artificialIntelligenceGrade;
        mDigitalMarketingGrade = digitalMarketingGrade;
        mMachineLearningGrade = machineLearningGrade;
        mDataAnalystGrade = dataAnalystGrade;
    }

    /**
     * Get the grade for Robotics matter of the ReportCard
     */
    public int getRoboticsGrade() {
        return mRoboticGrade;
    }

    /**
     * Get the grade for Android matter of the ReportCard
     */
    public int getAndroidGrade() {
        return mAndroidGrade;
    }

    /**
     * Get the grade for Artificial Intelligence matter of the ReportCard
     */
    public int getArtificialIntelligenceGrade() {
        return mArtificialIntelligenceGrade;
    }

    /**
     * Get the grade for Digital Marketing matter of the ReportCard
     */
    public int getDigitalMarketingGrade() {
        return mDigitalMarketingGrade;
    }

    /**
     * Get the grade for Machine Learning matter of the ReportCard
     */
    public int getMachineLearningGrade() {
        return mMachineLearningGrade;
    }

    /**
     * Get the grade for Data Analyst matter of the ReportCard
     */
    public int getDataAnalystGrade() {
        return mDataAnalystGrade;
    }

    /**
     * Set the grade for Robotics matter of the ReportCard
     */
    public void setRoboticsGrade(int roboticGrade) {
        // Validate the parameter before assigning them
        if (roboticGrade < VERIFY_NEGATIVE){
            mRoboticGrade = VERIFY_NEGATIVE;
        }
        else {
            mRoboticGrade = roboticGrade;
        }
    }

    /**
     * Set the grade for Android matter of the ReportCard
     */
    public void setAndroidGrade(int androidGrade) {
        // Validate the parameter before assigning them
        if (androidGrade < VERIFY_NEGATIVE){
            mAndroidGrade = VERIFY_NEGATIVE;
        }
        else {
            mAndroidGrade = androidGrade;
        }
    }

    /**
     * Set the grade for Artificial Intelligence matter of the ReportCard
     */
    public void setArtificialIntelligenceGrade(int artificialIntelligenceGrade) {
        // Validate the parameter before assigning them
        if (artificialIntelligenceGrade < VERIFY_NEGATIVE){
            mArtificialIntelligenceGrade = VERIFY_NEGATIVE;
        }
        else {
            mArtificialIntelligenceGrade = artificialIntelligenceGrade;
        }
    }

    /**
     * Set the grade for Digital Marketing matter of the ReportCard
     */
    public void setDigitalMarketingGrade(int digitalMarketingGrade) {
        // Validate the parameter before assigning them
        if (digitalMarketingGrade < VERIFY_NEGATIVE){
            mDigitalMarketingGrade = VERIFY_NEGATIVE;
        }
        else {
            mDigitalMarketingGrade = digitalMarketingGrade;
        }
    }

    /**
     * Set the grade for Machine Learning matter of the ReportCard
     */
    public void setMachineLearningGrade(int machineLearningGrade) {
        // Validate the parameter before assigning them
        if (machineLearningGrade < VERIFY_NEGATIVE){
            mMachineLearningGrade = VERIFY_NEGATIVE;
        }
        else {
            mMachineLearningGrade = machineLearningGrade;
        }
    }

    /**
     * Set the grade for Data Analyst matter of the ReportCard
     */
    public void setDataAnalystGrade(int dataAnalystGrade) {
        // Validate the parameter before assigning them
        if (dataAnalystGrade < VERIFY_NEGATIVE){
            mDataAnalystGrade = VERIFY_NEGATIVE;
        }
        else {
            mDataAnalystGrade = dataAnalystGrade;
        }
    }

    /**
     * Returns the string representation of the {@link ReportCard} object.
     */
    @Override
    public String toString() {
        return "The Report Card for student is: " +
                "\nRobotics " + mRoboticGrade +
                "\nAndroid " + mAndroidGrade +
                "\nArtificial Intelligence " + mArtificialIntelligenceGrade+
                "\nDigital Marketing " + mDigitalMarketingGrade +
                "\nMachine Learning " + mMachineLearningGrade +
                "\nData Analyst " + mDataAnalystGrade;
    }

}
