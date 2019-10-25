# Planet Position Processing

## 1st Stage Conditions:

- All bodies orbiting one central body
- Orbits are determined by central body (2-body orbit)
- Flat universe
- No axial tilt of bodies
- Circular orbit

## Order of Events

- Epoch is a time event
- Changes in movement of body will be processed by a system controller
- If no change in movement is decided (either it does not exist or its change is too small to be practical), nothing will happen
- If change in movement is decided, orbit values will be updated

## Orbit

- Orbit has values that define it
- Actual, non-disturbed orbit will only be calculated as position using values
- Orbit values can be changed by System Controller

## Body

- Bodies will not be represented to scale
- Collision handling is not yet defined, but will most likely be tasked to the System Controller

# Design

- Bodies will use an Obser pattern; each body is subscribed to the system controller. However, it is not a traditional Observer pattern, as the Orbits will not be tasked with updating themselves. This calls into question how tightly the System Controller and the Orbits are coupled, and the question of if another pattern can be used is raised.
  - System controller will loop through all bodies and calculate forces applied to determine if change in orbit is significant
  - If change in orbit is significant for planet, it will update that planet
  - System Controller may be viewed as aggregate of orbits

## Possibilities:

1. Graphics can carry out these continuous updates to planet location
2. A .c file performing logic can be constantly queried for planet location from graphics
3. Planet location can be stored as a .json file and can be queried when location is needed (as on startup)

(multiple matrix transforms, carry over variables so that resulting matrix contains variables. This means that only one final matrix needs to be processed when doing that combination transformation. Is this practical/viable/sensical? )

## Sequence

1. Menu --loadSystem--> OrbitController
2. OrbitController --getSystemJSON--
3. OrbitController --showSystem--
4. a. OrbitController --_loop_--

- for each planet
  - check distance to other planets
  - if distance to planet is deemed small enough
    - force calculation from planet is performed
    - new orbit is configured and old orbit values are overwritten
  - else continue
- wait for next interval to finish and run again

4. b OrbitDisplay --_loop_--

- calculate coordinates from orbit values + epoch
- render at coordinates
- wait till epoch interval changes

## Orbit

When specifying Orbit to be created, use state vectors (Cartesian). WHen actually creating orbit, switch to keplarian and save as such. When calculating perturbations from 3rd body, switch to state vectors for ease of access, then revert back.
