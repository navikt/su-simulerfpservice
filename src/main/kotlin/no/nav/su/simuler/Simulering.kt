package no.nav.su.simuler

import no.nav.system.os.entiteter.oppdragskjema.*
import no.nav.system.os.tjenester.simulerfpservice.simulerfpservicegrensesnitt.SimulerBeregningRequest
import no.nav.system.os.tjenester.simulerfpservice.simulerfpserviceservicetypes.Oppdrag
import no.nav.system.os.tjenester.simulerfpservice.simulerfpserviceservicetypes.Oppdragslinje
import no.nav.system.os.eksponering.simulerfpservicewsbinding.SimulerFpService
import java.math.BigInteger
import java.time.LocalDate

/**
 * Forstår hvordan man kaller på
 *
 * serviceLocation er typisk der simuleringstjenesten befinner seg
 */
internal class Simulering(private val factory: SOAPFactory) {
    private val fpService: SimulerFpService? = null

    fun simuler(vedtak: Any): Any {
        val res = factory.build(
            serviceUrl = "",
            stsUrl = "",
            username = "",
            password = ""
        ).simulerBeregning(
            SimulerBeregningRequest().apply {
                this.request =
                    no.nav.system.os.tjenester.simulerfpservice.simulerfpserviceservicetypes.SimulerBeregningRequest()
                        .apply {
                            this.oppdrag = Oppdrag().apply {
                                this.oppdragslinje.add(Oppdragslinje().apply {
                                    this.attestant.add(Attestant().apply {
                                        this.attestantId = "Atte Restante"
                                        this.datoUgyldigFom = LocalDate.now().plusYears(100).toString()
                                    })
                                    this.enhet.add(Enhet().apply {
                                        this.enhet = "enheten det er snakk om"
                                        this.typeEnhet = "typen enhet det er snakk om"
                                    })
                                    this.grad.add(Grad().apply {
                                        this.grad = BigInteger.ONE
                                        this.typeGrad = "jeg vet vel ikke?"
                                    })
                                    this.valuta.add(Valuta().apply {
                                        this.valuta = "NOK"
                                        this.typeValuta = "wat."
                                    })
                                    this.tekst.add(Tekst().apply {
                                        this.tekst = "Dette er kanskje teksten på utbetalingsslippen?"
                                    })
                                })
                                this.avstemmingsnokkel.add(Avstemmingsnokkel().apply {
                                    this.avstemmingsNokkel = "en fin, gul nøkkel"
                                    this.kodeKomponent = "er kodekomponent noe viktig?"
                                })
                                this.bilagstype.add(Bilagstype().apply {
                                    this.typeBilag = "alfabetisk"
                                })
                            }
                            this.simuleringsPeriode = no.nav.system.os.tjenester.simulerfpservice.simulerfpserviceservicetypes.SimulerBeregningRequest.SimuleringsPeriode().apply {
                                this.datoSimulerFom = LocalDate.now().toString()
                                this.datoSimulerTom = LocalDate.now().plusYears(290).toString()
                            }
                        }
            }
        )
        return res
    }
}