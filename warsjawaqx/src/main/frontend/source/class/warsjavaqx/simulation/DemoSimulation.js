qx.Class.define("warsjavaqx.simulation.DemoSimulation", {

  extend : warsjavaqx.unit.TestCase,
  
  members :
  {
    /*
    ---------------------------------------------------------------------------
      TESTS
    ---------------------------------------------------------------------------
    */
    
    /** Check if a widget is present (part of the DOM) */
    testButtonPresent : function()
    {
      this.assertNotNull(this.getSimulation().getWidgetOrNull("qxh=qx.ui.form.Button"), "Button widget not present!");
    },
    
    /** Click a button and check if an alert box pops up */
    testButtonClick : function()
    {
      this.getQxSelenium().qxClick("qxh=qx.ui.form.Button");
      this.assertEquals("true", String(this.getQxSelenium().isAlertPresent()));
    }
  }
  
});