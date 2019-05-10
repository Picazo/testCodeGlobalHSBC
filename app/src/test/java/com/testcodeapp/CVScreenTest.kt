package com.testcodeapp

import com.testcodeapp.APIS.APIServices
import com.testcodeapp.Contract.ContractCV
import com.testcodeapp.Model.CurriculumVitae
import com.testcodeapp.Presenter.CVPresenter

import org.junit.Test

import org.junit.Before
import org.junit.runner.RunWith
import org.mockito.Mockito.verify
import org.mockito.junit.MockitoJUnitRunner
import org.mockito.Mock

/**
 * App's unit testing
 */
@RunWith(MockitoJUnitRunner::class)
class PreviewPresenterUnitTest {
    @Mock
    lateinit var apiService: APIServices
    @Mock
    private lateinit var view: ContractCV.View
    @Mock
    private lateinit var presenter: ContractCV.Presenter

    private val userResponse: CurriculumVitae.Person = CurriculumVitae.Person(
        name = "Deborah",
        age = "Kurata",
        direction = "Pleasanton, CA",
        email = "kurata.deborah@pluralsight.com",
        phone_number = "+1 925-463-1955",
        about_me = "blogs.msmvps.com/deborahk"
    )

    @Before
    fun setUp() {
        presenter = CVPresenter(view)
    }


    @Test
    fun testValidatePresenterInicialitation() {
        presenter.getCV()
        verify(view).setPresenter(presenter)
    }

    //TODO: validate return of petition retrofit
    /*@Test
    fun testValidateData() {
        Mockito.`when`(apiService.getCV()).thenReturn(userResponse)

        presenter.getCV()
        verify(view).setData(userResponse.name,userResponse.age,userResponse.direction,userResponse.email,userResponse.phone_number,userResponse.about_me)
    }*/


}