package StatePatternDemo;

public class StatePatternDemoFanWallControl {

        private SpeedLevel current;

        public void set_State(SpeedLevel state) {
            current = state;
        }

        public void rotate(){
            current.rotate(this);
        }

        @Override
        public String toString() {
            return String.format("FanWallControl[current = %s]", current);
        }

        public StatePatternDemoFanWallControl() {
            current = new Off();
        }

        static class Off implements SpeedLevel {
            @Override
            public void rotate(StatePatternDemoFanWallControl fanWallControl) {
                fanWallControl.set_State(new SpeedLevel1());
            }
        }

        static class SpeedLevel1 implements SpeedLevel {

            @Override
            public void rotate(StatePatternDemoFanWallControl fanWallControl) {
                fanWallControl.set_State(new SpeedLevel2());
            }
        }

        static class SpeedLevel2 implements SpeedLevel {

            @Override
            public void rotate(StatePatternDemoFanWallControl fanWallControl) {
                fanWallControl.set_State(new SpeedLevel3());
            }
        }

        static class SpeedLevel3 implements SpeedLevel {

            @Override
            public void rotate(StatePatternDemoFanWallControl fanWallControl) {
                fanWallControl.set_State(new Off());
            }
        }

    public static void main(String[] args) {
        StatePatternDemoFanWallControl fanWallControl = new StatePatternDemoFanWallControl();
        System.out.println(fanWallControl);

        fanWallControl.rotate();
        System.out.println(fanWallControl);

        fanWallControl.rotate();
        System.out.println(fanWallControl);

        fanWallControl.rotate();
        System.out.println(fanWallControl);

        fanWallControl.rotate();
        System.out.println(fanWallControl);
    }
}
