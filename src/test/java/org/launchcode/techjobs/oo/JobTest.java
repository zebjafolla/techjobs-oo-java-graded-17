package org.launchcode.techjobs.oo;

import org.junit.Test;

import static org.junit.Assert.*;

public class JobTest {
    //TODO: Create your unit tests here
    @Test
    public void testSettingJobId (){
        Job job1 = new Job();
        Job job2 = new Job();
        assertNotEquals(job1.getId(), job2.getId());
    }
    @Test public void testJobConstructorSetsAllFields() {
        Job job3 = new Job(("Product Tester"), new Employer("ACME"), new Location("Desert"), new PositionType("Quality Control"), new CoreCompetency("Persistence"));
        //assertEquals tests the values ("names") of the objects were set properly
        assertEquals("Product Tester", job3.getName());
        assertEquals("ACME", job3.getEmployer().toString());
        assertEquals("Desert", job3.getLocation().toString());
        assertEquals("Quality Control", job3.getPositionType().toString());
        assertEquals("Persistence", job3.getCoreCompetency().toString());


        //assertTrue assesses whether the objects set by the constructor are the correct objects
        assertTrue(job3.getName() instanceof String);
        assertTrue(job3.getEmployer() instanceof Employer);
        assertTrue(job3.getLocation() instanceof Location);
        assertTrue(job3.getPositionType() instanceof PositionType);
        assertTrue(job3.getCoreCompetency() instanceof CoreCompetency);

    }
    @Test
    public void testJobsForEquality(){

        // uses the overridden equals() method (that I wrote)
        // built into the object class  to test whether the ids are in fact different for each object (job4 and job 5)
        Job job4 = new Job("Stocker", new Employer("ACME"), new Location("Moorestown"), new PositionType("Bagger"), new CoreCompetency("Customer Service"));
        Job job5 = new Job("Cashier", new Employer("ShopRite"), new Location("Philadelphia"), new PositionType("Customer Service"), new CoreCompetency("Front-end"));
        assertFalse(job4.equals(job5));
    }
}
