/* ************************************************************************
#asset(warsjavaqx/*)
************************************************************************ */

/**
 * This is the main application class of your custom application "warsjavaqx"
 */
qx.Class.define("warsjavaqx.Application",
{
    extend : qx.application.Standalone,
    
    members :
    {
        main : function()
        {
            // Call super class
            this.base(arguments);
            
            // set default locale
            qx.locale.Manager.getInstance().setLocale("en");
            
            // Enable logging in debug variant
            if (qx.core.Environment.get("qx.debug"))
            {
                // support native logging capabilities, e.g. Firebug for Firefox
                qx.log.appender.Native;
                // support additional cross-browser console. Press F7 to toggle visibility
                qx.log.appender.Console;
            }
            
            // add main component
            //this.getRoot().add(new warsjavaqx.components.TopComposite(), {
            //    edge : 0
            //});
        }
    }
});
