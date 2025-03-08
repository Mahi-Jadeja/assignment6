# assignment6

Strategy Pattern - Duck Simulation

Features
Implements the Strategy Pattern to manage duck behaviors dynamically.
Ducks have interchangeable behaviors for flying, quacking, and swimming.
Behaviors can be modified at runtime using setter methods.
Supported Duck Types
MallardDuck - Flies, Quacks, Swims
RedheadDuck - Flies, Quacks, Swims
RubberDuck - Doesn't fly, Squeaks, Floats
DecoyDuck - Doesn't fly, Doesn't quack, Floats
Implemented Behaviors
Flying (FlyBehavior)
FlyWithWings → Ducks that can fly
FlyNoWay → Ducks that cannot fly
Quacking (QuackBehavior)
Quack → Normal duck quacking
Squeak → Rubber duck squeaking
MuteQuack → No sound
Swimming (SwimBehavior)
Swim → Ducks that swim
Float → Ducks that just float
Drown → Ducks that sink
