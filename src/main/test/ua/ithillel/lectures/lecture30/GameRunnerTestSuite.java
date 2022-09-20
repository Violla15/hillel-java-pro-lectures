package ua.ithillel.lectures.lecture30;

import org.junit.platform.suite.api.SelectPackages;
import org.junit.platform.suite.api.Suite;
import org.junit.platform.suite.api.SuiteDisplayName;

@Suite
@SuiteDisplayName("Game runner and gamepad tests suite")
@SelectPackages("ua.ithillel.lectures.lecture30.runner")
public class GameRunnerTestSuite {
}
