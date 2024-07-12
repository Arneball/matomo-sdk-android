package org.matomo.sdk.tools

import android.os.Build
import org.junit.Assert
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.junit.MockitoJUnitRunner
import testhelpers.BaseTest

@RunWith(MockitoJUnitRunner::class)
class BuildInfoTest : BaseTest() {
    private var mBuildInfo: BuildInfo? = null

    @Before
    @Throws(Exception::class)
    override fun setup() {
        super.setup()
        mBuildInfo = BuildInfo()
    }

    @Test
    fun testGetRelease() {
        Assert.assertEquals(Build.VERSION.RELEASE, mBuildInfo!!.release)
    }

    @Test
    fun testGetModel() {
        Assert.assertEquals(Build.MODEL, mBuildInfo!!.model)
    }

    @Test
    fun testGetBuildId() {
        Assert.assertEquals(Build.ID, mBuildInfo!!.buildId)
    }
}
